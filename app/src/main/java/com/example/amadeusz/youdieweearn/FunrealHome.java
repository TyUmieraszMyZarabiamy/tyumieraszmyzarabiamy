package com.example.amadeusz.youdieweearn;

public class FunrealHome {

    private String name;
    private int scope;
    private int idFunreal;
    private Adress adress;

    private class Adress {

        String street;
        int streetNumber;
        int localNumber;
        int postCode;
        String city;

        public Adress(String street, int streetNumber, int localNumber, int postCode, String city) {
            this.street = street;
            this.streetNumber = streetNumber;
            this.localNumber = localNumber;
            this.postCode = postCode;
            this.city = city;
        }

    }

    public FunrealHome(String name, int scope, int idFunreal, String street, int streetNumber, int localNumber, int postCode,
                       String city) {
        this.name = name;
        this.scope = scope;
        this.idFunreal = idFunreal;
        this.adress = new Adress(street, streetNumber, localNumber, postCode, city);
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return adress.city;
    }

}
