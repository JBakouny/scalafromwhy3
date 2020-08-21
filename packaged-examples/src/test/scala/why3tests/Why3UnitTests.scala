package why3tests
import org.scalatest.funsuite.AnyFunSuite
class Why3UnitTests extends AnyFunSuite{
val green = BigInt(1)
test("TestAbsFunction") {
assert(TestAbsFunction.main(green) == green)
}
test("TestADT") {
assert(TestADT.main(green) == green)
}
test("TestBoolean") {
assert(TestBoolean.main(green) == green)
}
test("TestFactorialFunction") {
assert(TestFactorialFunction.main(green) == green)
}
test("TestFunction1") {
assert(TestFunction1.main(green) == green)
}
test("TestIdFunction") {
assert(TestIdFunction.main(green) == green)
}
test("TestIntid") {
assert(TestIntid.main(green) == green)
}
test("TestLetRefFunction") {
assert(TestLetRefFunction.main(green) == green)
}
test("TestMaxFunction") {
assert(TestMaxFunction.main(green) == green)
}
test("TestMaximumSubarray") {
assert(TestMaximumSubarray.main(green) == green)
}
test("TestMultiple") {
assert(TestMultiple.main(green) == green)
}
test("TestOnIntsFunction") {
assert(TestOnIntsFunction.main(green) == green)
}
test("TestPattern") {
assert(TestPattern.main(green) == green)
}
test("TestPolymorphismFunction") {
assert(TestPolymorphismFunction.main(green) == green)
}
test("TestRandomAccessList") {
assert(TestRandomAccessList.main(green) == green)
}
test("TestRecFactFunction") {
assert(TestRecFactFunction.main(green) == green)
}
test("TestSquareFunction") {
assert(TestSquareFunction.main(green) == green)
}
test("TestSum") {
assert(TestSum.main(green) == green)
}
test("TestWhile") {
assert(TestWhile.main(green) == green)
}
}
