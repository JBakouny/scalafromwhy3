#Ce script marche bien
make
rm packaged-examples/src/main/scala/why3tests/*.scala
unit_test_dest="packaged-examples/src/test/scala/why3tests/Why3UnitTests.scala"
echo "package why3tests" > $unit_test_dest
echo "import org.scalatest.funsuite.AnyFunSuite" >> $unit_test_dest
echo "class Why3UnitTests extends AnyFunSuite{" >> $unit_test_dest
echo "val green = BigInt(1)" >> $unit_test_dest
ls why3tests  | grep -E '.mlw' | while read ligne
do
name_file=$(ls why3tests/$ligne | awk -F '/' '{print $2}' | awk -F '.' '{print $1}')
destination="packaged-examples/src/main/scala/why3tests/$name_file.scala"
echo "package why3tests" > $destination
echo "object $name_file{" >> $destination
why3 extract -D scala why3tests/$ligne 2> /dev/null >> $destination
echo "}" >> $destination
echo "test(\"$name_file\") {" >> $unit_test_dest
echo "assert($name_file.main(green) == green)" >> $unit_test_dest
echo "}" >> $unit_test_dest
done

echo "}" >> $unit_test_dest
cd packaged-examples/ && sbt compile test
