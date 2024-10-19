// Question Link: https://www.geeksforgeeks.org/problems/data-type-1666706751/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=data-type

class _02_DataTypes {
    static int dataTypeSize(String str) {
        if (str.equals("Character")) {
            return 2;
        }
        else if (str.equals("Integer")) {
            return 4;
        }
        else if (str.equals("Long")) {
            return 8;
        }
        else if (str.equals("Float")) {
            return 4;
        }
        else if (str.equals("Double")) {
            return 8;
        }

        // Return -1 if the input does not match any known data type
        return -1;
    }
}
