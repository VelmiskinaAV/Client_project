public class Client {

    public int clientAge;
    public int gender;
    public boolean isSmoke;
    public int durationAG;
    public double CAD;
    public double DAD;
    public double cholesterol;
    public double interleukin;
    public double TNF;
    public double neopterin;
    public double lacticAcid;
    public double alphaLinolenicAcid;
    public double arachidonicAcid;
    public double MDA;
    public double COD;
    public double IMMLG;
    public boolean bloodReduction;

    Client(int clientAge, int gender, boolean isSmoke, int durationAG, double CAD, double DAD,
           double cholesterol, double interleukin, double TNF, double neopterin, double lacticAcid,
           double alphaLinolenicAcid, double arachidonicAcid, double MDA, double COD, double IMMLG,
         boolean bloodReduction){

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

    public void show(){

        String smoke;

        if (isSmoke){
            smoke = "Да";
        } else {
            smoke = "нет";
        }

        String gen = "";

        if (gender == 1){
            gen = "мужской";
        }
        if (gender == 0){
            gen = "женский";
        }

        String reduction;

        if(bloodReduction){
            reduction = "подвержен(а)";
        } else {
            reduction = "не подвержен(а)";
        }

        System.out.println(" Возраст клиента: " + clientAge +
                "\n Пол: " + gen +
                "\n Курение: " + smoke +
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
                "\n Градация по степени ночной редукции артериального давления: " + reduction +
                "\n");
    }

    public Points convertClientsDataToPoints(Client client){

        int clientAgePoint = 0;
        if (client.clientAge >= 65) {
            clientAgePoint = 1;
        }

        int genderPoint = 0;
        if (client.gender == 1) {
            genderPoint = 1;
        }

        int isSmokePoint = 0;
        if (client.isSmoke) {
            isSmokePoint = 1;
        }

        int durationAGPoint = 0;
        if (client.durationAG >= 2 && client.durationAG <= 5 ) {
            durationAGPoint = 1;
        }
        if (client.durationAG >= 10) {
            durationAGPoint = 2;
        }

        int CADPoint = 0;
        if (client.CAD >= 145.0 && client.CAD < 155.0) {
            CADPoint = 1;
        } else
        if (client.CAD >= 165.0) {
            CADPoint = 2;
        }

        int DADPoint = 0;
        if (client.DAD > 100) {
            DADPoint = 1;
        }

        int cholesterolPoint = 0;
        if (client.cholesterol > 5.0) {
            cholesterolPoint = 1;
        }

        int interleukinPoint = 0;
        if (client.interleukin < 6.5) {
            interleukinPoint = 1;
        }

        int TNFPoint = 0;
        if (client.TNF >= 9.0) {
            TNFPoint = 1;
        }

        int neopterinPoint = 0;
        if (client.neopterin >= 4.0) {
            neopterinPoint = 1;
        }

        int lacticAcidPoint = 0;
        if (client.lacticAcid >= 2.5) {
            lacticAcidPoint = 1;
        }

        int alphaLinolenicAcidPoint = 0;
        if (client.alphaLinolenicAcid > 200) {
            alphaLinolenicAcidPoint = 1;
        }

        int arachidonicAcidPoint = 0;
        if (client.arachidonicAcid > 1200) {
            arachidonicAcidPoint = 1;
        }

        int MDAPoint = 0;
        if (client.MDA > 3.0) {
            MDAPoint = 1;
        }

        int CODPoint = 0;
        if (client.COD > 6.0) {
            CODPoint = 1;
        }

        int IMMLGPoint = 0;
        if (client.IMMLG > 100) {
            IMMLGPoint = 1;
        }

        int bloodReductionPoint = 0;
        if (!client.bloodReduction) {
            lacticAcidPoint = 1;
        }

        Points points = new Points(clientAgePoint, genderPoint, isSmokePoint, durationAGPoint, CADPoint,
                DADPoint, cholesterolPoint, interleukinPoint, TNFPoint, neopterinPoint, lacticAcidPoint,
                alphaLinolenicAcidPoint, arachidonicAcidPoint, MDAPoint, CODPoint, IMMLGPoint, bloodReductionPoint);

        return points;
    }

}
