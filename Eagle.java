
class Eagle extends Bird {

    String makeNoise() {
        return "screech";
    }
    
    String move(int dist) {
        return super.move(dist * 2);
    }

}
