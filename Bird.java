
class Bird extends Animal {

    String makeNoise() {
        return "chirp";
    }
    
    // Sabrina was here but then she left
    String move(int dist) {
        String retval = "";
        for (int i=0; i<dist; i++) {
            retval += "flap ";
        }
        return retval.substring(0,retval.length()-1);
    }


}
