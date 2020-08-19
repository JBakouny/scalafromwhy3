package why3tests
import org.scalatest.funsuite.AnyFunSuite
class Why3UnitTests extends AnyFunSuite{
val green = BigInt(1)
test("TestAbsFunction") {
assert(TestAbsFunction.main(green) == green)
}
test("TestBoolean") {
assert(TestBoolean.main(green) == green)
}
test("TestFactorialFunction") {
assert(TestFactorialFunction.main(green) == green)
}
test("TestIdFunction") {
assert(TestIdFunction.main(green) == green)
}
test("TestMultiple") {
assert(TestMultiple.main(green) == green)
}
test("TestSquareFunction") {
assert(TestSquareFunction.main(green) == green)
}
}
