
class Bird extends Animal {

    String makeNoise() {
        return "chirp";
    }
    
    // Sabrina was here but then she left
    // and then she returned and then class was done.
    String move(int dist) {
        String retval = "";
        for (int i=0; i<dist*2; i++) {
            retval += "flap ";
        }
        return retval.substring(0,retval.length()-1);
    }


}
