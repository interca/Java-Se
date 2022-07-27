package system;

public class tesdt2 {
    public static void main(String[] args) {
        int n=4;
        int [][]nums={{1,10,4,2},{9,3,8,7},{33,222,17,12}};
        int i,j;
        int max,min;
        int k;
        for(i=0;i<3;i++) {
            min = 0;
            max = 0;
            for (j = 0; j < 4; j++) {
                if (nums[i][j] <= nums[i][min]) {
                    min = j;
                }
            }
            for (k = 0; k < 3; k++) {
                if (nums[k][min] >= nums[max][min]) {
                    max = k;
                }
            }
            System.out.println("max=" + max + "i=" + i);
            if (max == i) {
                System.out.println(nums[i][min]);
                break;
            }
        }

        }
    }

