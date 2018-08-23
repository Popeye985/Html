package com.company;

public class HTML {
    private String titel;
    private String paragraaf="";

    public HTML (String titel){
        this.titel = titel;



    }
    public void addParagraaf (String s){
        paragraaf = this.paragraaf + String.format("<p>%s</p>%n", s);

    }
    public String getHTML(){


        return String.format("<html><head>%n%1$s</head>%n<title>%n%s</title>%n<body>%n</body%s>", titel, titel, paragraaf);
    }

}
