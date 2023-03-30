
  abstract class CrudOperation {
    def create(value: Int): Seq[Int]
    def read(value: Int): Option[Int]
    def update(valueToUpdate: Int, valueToUpdateWith: Int): Seq[Int]
    def delete(valueToDelete: Int): Seq[Int]
  }

  class ListCrudOperation extends CrudOperation {
    var list: List[Int] = List[Int]()

    //create  use to create List
    override def create(value: Int): List[Int] = {
      list = list :+ value
      list
    }

      // read is used to read the element
    override def read(value: Int): Option[Int] = {
      if(!list.contains(value)) throw new NoSuchElementException()
      list.find(_ == value)
    }

    //update the Element  with another Element

    override def update(valueToUpdate: Int, valueToUpdateWith: Int): List[Int] = {
      if(list.indexOf(valueToUpdate)==0) throw new IndexOutOfBoundsException()
      list = list.updated(list.indexOf(valueToUpdate), valueToUpdateWith)
      list
    }

    //delete the element
    override def delete(valueToDelete: Int): List[Int] = {
      if(!list.contains(valueToDelete)) throw new NoSuchElementException()
      list = list.filterNot(_ == valueToDelete)
      list
    }
  }

   // Sequence crud operation

  class SeqCrudOperation extends CrudOperation {
    var seq: Seq[Int] = Seq[Int]()

    //create a Sequence
    override def create(value: Int): Seq[Int] = {
      seq = seq :+ value
      seq
    }

    //read the element from Sequence
    override def read(value: Int): Option[Int] = {
      seq.find(_ == value)
    }


    //update the element with another element
    override def update(valueToUpdate: Int, valueToUpdateWith: Int): Seq[Int] = {
      val index = seq.indexOf(valueToUpdate)
      if(seq.indexOf(valueToUpdate)==0) throw new IndexOutOfBoundsException()
      if (index >= 0) {
         seq =  seq.updated(seq.indexOf(valueToUpdate), valueToUpdateWith)
         seq
        }else {
         seq
        }
    }

    //delete the particular element from Sequence
    override def delete(valueToDelete: Int): Seq[Int] = {
      if (seq.contains(valueToDelete)) {
       seq = seq.filterNot(_==valueToDelete)
        seq
      }
      else
        seq
    }
  }
