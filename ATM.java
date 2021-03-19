public class ATM {
  
    public int countBanknotes(int sum) {
        int result = 0;
        int temp = sum % 500;  
        sum = sum / 500;
        result += sum; 
        if (temp == 0) return result;
        sum = temp;
        
        // next checking for 200 banknotes
        temp = sum % 200;  
        sum = sum / 200;
        result += sum; 
        if (temp == 0) return result;
        sum = temp;
        
        // next checking for 100 banknotes
        temp = sum % 100;  
        sum = sum / 100;
        result += sum; 
        if (temp == 0) return result;
        sum = temp;
        
        // next checking for 50 banknotes
        temp = sum % 50;  
        sum = sum / 50;
        result += sum; 
        if (temp == 0) return result;
        sum = temp;
        
        // next checking for 20 banknotes
        temp = sum % 20;  
        sum = sum / 20;
        result += sum; 
        if (temp == 0) return result;
        sum = temp;
        
        // next checking for 10 banknotes
        temp = sum % 10;  
        sum = sum / 10;
        result += sum; 
        if (temp == 0) return result;
        sum = temp;
        
        // next checking for 5 banknotes
        temp = sum % 5;  
        sum = sum / 5;
        result += sum; 
        if (temp == 0) return result;
        sum = temp;
         
        // next checking for 2 banknotes
        temp = sum % 2;  
        sum = sum / 2;
        result += sum; 
        if (temp == 0) return result;
        sum = temp;
        
        // next checking for 1 banknotes
        result += sum; 
        return result;
    }
  
  
}