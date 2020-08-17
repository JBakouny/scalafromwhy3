#Ce script marche bien
unit_test_dest="packaged-examples/src/test/scala/why3tests/Why3UnitTests.scala"


ls why3tests  | grep -E '.mlw' | while read ligne
do
name_file=$(ls why3tests/$ligne | awk -F '/' '{print $2}' | awk -F '.' '{print $1}')
destination="packaged-examples/src/main/scala/why3tests/$name_file.scala"
echo 'package why3tests' > $destination
echo "object $name_file{" >> $destination
why3 extract -D scala why3tests/$ligne 2> /dev/null >> $destination
echo "}" >> $destination


done 



cd package-examples/ && sbt compile test
