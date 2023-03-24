import org.scalatest.funsuite.AnyFunSuite

class ListCrudOperationTest extends AnyFunSuite {

  test("Test case for Create List "){
    val crudListInstance = new ListCrudOperation
    crudListInstance.create(23)
    crudListInstance.create(34)
    val expectedValue =2
    val actualValue =crudListInstance.list.size
    assert(actualValue===expectedValue)
  }


  test("Test case  for Read an element in a List ") {
    val crudListInstance = new ListCrudOperation
    crudListInstance.create(23)
    crudListInstance.create(34)
    val actualValue =crudListInstance.read(23)
    val expectedValue = Some(23)
    assert(actualValue===expectedValue)
  }


  test("Test case  for Update the list ") {
    val crudListInstance = new ListCrudOperation
    crudListInstance.create(23)
    crudListInstance.create(34)
    val actualValue = crudListInstance.update(34,99)
    val expectedValue = List(23,99)
    assert(actualValue===expectedValue)
  }


  test("Test case  for delete element in list ")
  {
    val crudListInstance = new ListCrudOperation
    crudListInstance.create(23)
    crudListInstance.create(34)
    val actualValue =crudListInstance.delete(34)
    val expectedValue =List(23)
    assert(actualValue===expectedValue)
  }


  /*
  Test cases for Sequence
   */

  test("Test case for Create sequence ") {
    val crudSeqInstance = new SeqCrudOperation
    crudSeqInstance.create(23)
    crudSeqInstance.create(34)
    val expectedValue = 2
    val actualValue = crudSeqInstance.seq.size
    assert(actualValue === expectedValue)
  }


  test("Test case  for Read an element in a Seq ") {
    val crudSeqInstance = new SeqCrudOperation
    crudSeqInstance.create(23)
    crudSeqInstance.create(34)
    val actualValue = crudSeqInstance.read(23)
    val expectedValue = Some(23)
    assert(actualValue === expectedValue)
  }


  test("Test case  for Update the Sequence ") {
    val crudSeqInstance = new SeqCrudOperation
    crudSeqInstance.create(23)
    crudSeqInstance.create(34)
    val actualValue = crudSeqInstance.update(34, 99)
    val expectedValue = List(23, 99)
    assert(actualValue === expectedValue)
  }


  test("Test case for delete element in Sequence ") {
    val crudSeqInstance = new SeqCrudOperation
    crudSeqInstance.create(23)
    crudSeqInstance.create(34)
    val actualValue = crudSeqInstance.delete(34)
    val expectedValue = List(23)
    assert(actualValue === expectedValue)
  }

}
