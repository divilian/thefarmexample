
class Animal {

    String makeNoise() {
        return "RAWR";
    }

    String move(int dist) {
        String retval = "";
        for (int i=0; i<dist; i++) {
            retval += "tramp ";
        }
        return retval.substring(0,retval.length()-1);
    }

    String moveversion2(int dist) {
        String retval = null;
        if (dist == 0) {
            retval = "";
        } else {
            retval = "tramp";
        }
        for (int i=1; i<dist; i++) {
            retval += " tramp";
        }
        return retval;
    }
    String moveversion3(int dist) {
        if (dist == 0) {
            return "";
        } else {
            String retval = "tramp";
            for (int i=1; i<dist; i++) {
                retval += " tramp";
            }
            return retval;
        }
    }
}
