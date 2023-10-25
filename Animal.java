
class Animal {

    String makeNoise() {
        return "peep";
    }

    String move(int dist) {
        String moveString = "";
        for (int i=0; i<dist; i++) {
            moveString += "tramp ";
        }
        return moveString.substring(0,moveString.length()-1);
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
