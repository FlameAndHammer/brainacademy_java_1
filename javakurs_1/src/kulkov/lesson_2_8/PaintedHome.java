package kulkov.lesson_2_8;

/**
 * Created by User on 28.08.2016.
 * Blueprint for creating a painted home
 */
class PaintedHome implements Cloneable{                             //Add cloneable interface to create copies of class instances
    private Rectangle walls;
    private Triangle roof;

    public PaintedHome (Rectangle rectangle, Triangle triangle) {   //Painted home constructor
        walls = rectangle;
        roof = triangle;
    }
    @Override
    public String toString() {                                      //Return information about the object
        return "Painted home, consisting of: " + walls + " " + roof;
    }
    @Override
    public PaintedHome clone() throws CloneNotSupportedException {  //Override cloning method for PaintedHome instances
        PaintedHome ph = (PaintedHome)super.clone();                //Copy the string representation of the object
        ph.walls = walls.clone();                                   //Invoke the method for reference type variables
        ph.roof = roof.clone();
        return ph;                                                  //Return the result
    }
    @Override
    public boolean equals(Object o) {                               //Override the equality check
        if (this == o) {                                            //If compared objects have the same reference
            return true;                                            //They are equal
        }
        if (o == null || getClass() != o.getClass()) {              //If one reference is null, or compared objects are from different classes
            return false;                                           //They are unequal
        }
        PaintedHome ph = (PaintedHome) o;                           //Type cast second object to use its methods
        return (walls.equals(ph.walls) && roof.equals(ph.roof));    //Invoke equals() method for reference type field variables
    }
    @Override
    public int hashCode() {                                         //When you override equals() you also need to override hashCode()
        int result = 1;                                             //Create hash code calculations using the fields of an object
        result = 31 * result + walls.hashCode();
        result = 31 * result + roof.hashCode();
        return result;
    }
}
