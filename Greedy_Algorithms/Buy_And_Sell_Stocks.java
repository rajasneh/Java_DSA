package Greedy_Algorithms;

public class Buy_And_Sell_Stocks {
    public static int MaxProfit(int arr[]){
        int maxprofit=0;
        int PrevStock=arr[0];

        for(int i=1;i<arr.length;i++){
            if(PrevStock>arr[i]){
                PrevStock=arr[i];
            }else if(arr[i]-PrevStock>maxprofit){
                maxprofit=arr[i]-PrevStock;
            }
        }
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[] = { 7, 1, 5, 6, 4 };
        int max_profit = MaxProfit(prices);
        System.out.println(max_profit);
    } 
}
