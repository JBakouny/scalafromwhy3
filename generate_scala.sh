#Ce script marche bien
ls testcases_whyml | grep -E '.mlw' | while read ligne
do
name_file=$(ls testcases_whyml/$ligne | awk -F '/' '{print $2}' | awk -F '.' '{print $1}')
destination="packaged-examples/src/main/scala/why3/$name_file.scala"
echo 'packaged why3' > $destination
echo "object main{" >> $destination
why3 extract -D scala testcases_whyml/$ligne 2> /dev/null >> $destination
echo "}" >> $destination
done 
