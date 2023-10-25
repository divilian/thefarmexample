
class Bird extends Animal {

    String makeNoise() {
        return "chirp";
    }
    
    // Sabrina was here but then she left but then she returned
    String move(int dist) {
        String retval = "";
        for (int i=0; i<dist+1; i++) {
            retval += "flap ";
        }
        return retval.substring(0,retval.length()-1);
    }


}
