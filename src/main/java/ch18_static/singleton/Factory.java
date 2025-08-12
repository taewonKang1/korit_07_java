package ch18_static.singleton;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Factory {
    private String factoryName;

    public SmartPhone produceSmartPhone() {
        System.out.println(factoryName + "에서 스마트폰을 생성합니다.");
        // 접근 지정자 안썼으니까 default 입니다. 그리고 {} 영역 내에 있으니까 지역변수네요
        String model = "갤럭시 S26";
        String serial = null;

        Samsung samsung = Samsung.getInstance();
        // Samsung 객체를 생성 -> 싱글톤 써서 동일 객체 계속 대입됨.
        serial = samsung.createSerialNumber(model);
        // 지금 리턴 타입이 SmartPhone > SmartPhone객체 나와야함

        SmartPhone  smartPhone = new SmartPhone(samsung.getCompany(), model, serial);
        return smartPhone;
    }
}
