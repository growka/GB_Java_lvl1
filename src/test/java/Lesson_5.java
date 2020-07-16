public class Lesson_5 {

    public static void main(String[] args) {

        Employer[] employers = new Employer[5];

        employers[0] = new Employer("Петров Петр Петрович", "директор", "+12347658", "petrov@mail.ru", 100000, 50);
        employers[1] = new Employer("Иванов Иван Иванович", "заместитель директора", "+12347658", "ivanov@mail.ru", 80000, 45);
        employers[2] = new Employer("Михайлов Михаил Михайлович", "руководитель отдела", "+12347658", "mihailov@mail.ru", 60000, 42);
        employers[3] = new Employer("Сидоров Сидор Сидорович", "директор", "+12347658", "sidorov@mail.ru", 50000, 39);
        employers[4] = new Employer("Петров Иван Михайлович", "директор", "+12347658", "petrov2@mail.ru", 30000, 30);


        for (int i=0; i < employers.length;i++) {

            if (employers[i].age > 40) System.out.println(employers[i].name + " " + employers[i].position + " " + employers[i].phone + " " + employers[i].mail + " " + employers[i].salary + " " + employers[i].age);

        }

    }

    public static class Employer {

        public String name;
        public String position;
        public String phone;
        public String mail;
        public int salary;
        public int age;

        public Employer(String name, String position, String phone, String mail, int salary, int age){

            this.name = name;
            this.position = position;
            this.phone = phone;
            this.mail = mail;
            this.salary = salary;
            this.age = age;
        }


    }


}



