public class Points {

    public int clientAge;
    public int gender;
    public int isSmoke;
    public int durationAG;
    public int CAD;
    public int DAD;
    public int cholesterol;
    public int interleukin;
    public int TNF;
    public int neopterin;
    public int lacticAcid;
    public int alphaLinolenicAcid;
    public int arachidonicAcid;
    public int MDA;
    public int COD;
    public int IMMLG;
    public int bloodReduction;

    Points(int clientAge, int gender, int isSmoke, int durationAG, int CAD, int DAD,
           int cholesterol, int interleukin, int TNF, int neopterin, int lacticAcid,
           int alphaLinolenicAcid, int arachidonicAcid, int MDA, int COD, int IMMLG,
           int bloodReduction){

        this.clientAge = clientAge;
        this.gender = gender;
        this.isSmoke = isSmoke;
        this.durationAG = durationAG;
        this.CAD = CAD;
        this.DAD = DAD;
        this.cholesterol = cholesterol;
        this.interleukin = interleukin;
        this.TNF = TNF;
        this.neopterin = neopterin;
        this.lacticAcid = lacticAcid;
        this.alphaLinolenicAcid = alphaLinolenicAcid;
        this.arachidonicAcid = arachidonicAcid;
        this.MDA = MDA;
        this.COD = COD;
        this.IMMLG = IMMLG;
        this.bloodReduction = bloodReduction;

    }


    public void sum(Points points){
        int result = 0;

        result  = points.clientAge + points.gender + points.isSmoke + points.durationAG +
                points.CAD + points.DAD + points.cholesterol + points.interleukin +
                points.TNF + points.neopterin + points.lacticAcid + points.alphaLinolenicAcid +
                points.MDA + points.COD + points.IMMLG + points.bloodReduction;

        if (result > 10){
            System.out.println("Кол-во баллов: " +  result + " - высокий риск \n");
        } else {
            System.out.println("Кол-во баллов: " +  result + " - низкий риск \n");
        }
    }

    public void show(){
        System.out.println(" Возраст клиента: " + clientAge +
                "\n Пол: " + gender +
                "\n Курение: " + isSmoke +
                "\n Длительность АГ, годы: "+ durationAG +
                "\n САД, мм рт. ст.: " + CAD +
                "\n ДАД, мм рт.ст.: " + DAD +
                "\n Холесерин, ммоль/л: " + cholesterol +
                "\n Интерлейкин-6, пг/мл: " + interleukin +
                "\n TNF-a, пг/мл: "+ TNF +
                "\n Неоптерин, нмоль/л: " + neopterin +
                "\n Молочная кислота, ммоль/л: " +  lacticAcid +
                "\n а-линолевая кислота, нмоль/мл: " + alphaLinolenicAcid +
                "\n Арахидоновая кислота, нмоль/мл: " + arachidonicAcid +
                "\n МДА, нмоль/г белка: " + MDA +
                "\n СОД, усл.ед: " + COD +
                "\n ИММЛЖ, г/м^2: " + IMMLG +
                "\n Градация по степени ночной редукции артериального давления: " + bloodReduction +
                "\n");
    }
}
