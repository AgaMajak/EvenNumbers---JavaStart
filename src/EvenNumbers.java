class EvenNumbers {
    
    void showNumbersAndSum() {
        System.out.println("Ta metoda wyświetli liczby parzyste od 1 do 100 i ich sumę.");
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
                sum +=i;
            }
        }
        System.out.println("Suma wyświetlonych liczb to: " + sum);
    }

}
