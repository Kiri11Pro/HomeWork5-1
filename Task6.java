public class Task6 {
    //    В американской армии считается несчастливым число 13,
//а в китайской – 4. Перед совместными учениями с американской и китайской армией, штаб украинской армии
//решил исключить номера боевой техники, содержащие
//числа 4 или 13 (например, 40123, 13373, 12345 или 61342),
//чтобы не смущать иностранных коллег.
//Написать программу, которая выведет на экран сколько
//всего номеров придется исключить, если в распоряжении
//армии имеется 100 тысяч единиц боевой техники и каждая
//боевая машина имеет номер от 00000 до 99999. Решить,
//используя строки
    public static void main(String[] args) {
        int amountMilitary, numMilitary,count;
        String[] military;
        String[] num;
        String strNum;
        amountMilitary = 100000;
        numMilitary = 1;
        count=0;
        for (int i = 0; i < amountMilitary; i++) {
            military[i] = Integer.toString(numMilitary);
            numMilitary++;
            num = military[i].split("");
            for (int j = 0; j < num.length;j++){
                if (num[j].equals("4")||(num[j]+num[j+1]).equals("13")){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
