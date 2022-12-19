package model;

public class Contact {
    private int id;
    private String name;
    private String phonenumber;
    public Contact(String name,String phonenumber)
    {
        this.name=name;
        this.phonenumber=phonenumber;
    }
    public Contact(int id,String name,String phonenumber)
    {
        this.id=id;
        this.name=name;
        this.phonenumber=phonenumber;
    }
    public Contact() {
    }
        public int getId()
        {
            return id;
        }
        public void setId(int id)
        {
            this.id=id;
        }
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name =name;
        }

    }

