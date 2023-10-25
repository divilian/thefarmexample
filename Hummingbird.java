
class Hummingbird extends Bird {

    Hummingbird() {
        super();
    }

    String move(int distance) {
        return super.move(distance) + " flap";
    }
        
}
