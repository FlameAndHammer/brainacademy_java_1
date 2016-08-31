package udovenko.lesson10;

/**
 * Created by gladi on 31.08.2016.
 */
class GenerateShape {
    static Shape getRandomShape(){
        switch (Shape.rndShape.nextInt(3)){
            default:
            case 0: return new Circle();

            case 1: return new Rectangle();

            case 2: return new Triangle();
        }
    }
}
