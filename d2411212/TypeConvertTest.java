package d2411212;

class TypeConvert{
    String url = "http://www.kma.go.kr";

    public void setUrl(String url){ this.url = url; }
    public String getUrl(){ return this.url; }
}

public class TypeConvertTest {

    public static void main(String[] args) {
        TypeConvert tc = new TypeConvert();
        Object obj = tc; //Object Ŭ������ �޼ҵ常 ȣ�Ⱑ��
//        System.out.println(obj.getUrl());
//        System.out.println(tc.getUrl());
        
      //  System.out.println(obj.hashCode());
       // System.out.println(tc.hashCode());
        
        TypeConvert tc2 = (TypeConvert)obj;
        System.out.println("tc2: " + tc2.getUrl());
        System.out.println("tc2: " + tc2.hashCode()); // ����� �ϸ� �ؽ��ڵ带 �����޴´�
        
    }

}