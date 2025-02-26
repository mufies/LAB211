package Tuan5;

public class LargeNum {
    public String res;

    public LargeNum() {
        this.res = "";
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public void add(String a, String b) {
        while (a.length() < b.length()) a = "0" + a;
        while (b.length() < a.length()) b = "0" + b;
        int nho=0;
        String h = "",h1="";
        for (int k = a.length()-1; k >= 0; k--) {
            int sum = (a.charAt(k) - '0') + (b.charAt(k) - '0') + nho;
            nho = sum/10;
            h1 = sum % 10 + h1;
        }
        if(nho == 1) h1 = "1" + h1;
        res = h1;


    }

    public void Multiply(String a, String b)
    {
        int m = a.length();
        int n = b.length();
        int[] result = new int[m + n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                int mul = (a.charAt(i) - '0') * (b.charAt(j) - '0');
                int p1 = i + j;
                int p2 = i + j + 1;
                int sum = mul + result[p2];
                result[p1] += sum / 10;
                result[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int num : result) {
            if (!(sb.isEmpty() && num == 0)) {
                sb.append(num);
            }
        }
        res = sb.isEmpty() ? "0" : sb.toString();
    }

}
