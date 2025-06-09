package com.example.opensource_server.movie.domain.constant;

public enum Countries {
    KOREA("한국"),
    SWEDEN("스웨덴"),
    JAPANESE("일본"),
    CHINA("중국"),
    MEXICO("멕시코"),
    AMERICA("미국");

    private final String country;


    Countries(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
