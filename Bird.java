
class Bird extends Animal {

    String makeNoise() {
        return "tweet";
    }
    
    // Sabrina was here
    String move(int dist) {
        String retval = "";
        for (int i=0; i<dist; i++) {
            retval += "flap ";
        }
        return retval.substring(0,retval.length()-1);
    }


}
