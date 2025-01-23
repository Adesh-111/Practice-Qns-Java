class CompareFloats{
    public static void main(String[] args) {
        float a = 1.255f;
        float b = 1.2555454f;
        int truncateFloat = 1000;
        int num1 = (int) (a*truncateFloat);
        int num2 = (int) (b*truncateFloat);
        if(num1 == num2){
            System.out.println("The float values are same upto 3 decimals");
        } else { 
            System.out.println("The float value is not same");
        }
    }
}