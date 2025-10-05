package ch00_review.test20251001_2;
// #16
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class JsonCreator {
    public static void main(String[] args) {
        // TODO: JsonObject를 생성하시오.
        JsonObject obj = new JsonObject();

        // TODO: username("guest"), isMember(true), visitCount(15) 속성을 추가하시오.
        obj.addProperty("username", "guest");
        obj.addProperty("isMember", "true");
        obj.addProperty("visitCount", 15);

        // TODO: setPrettyPrinting()이 활성화된 Gson 객체를 생성하시오.
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // TODO: JsonObject를 보기 좋은 형태의 JSON 문자열로 변환하여 출력하시오.
        String json = gson.toJson(obj);
        System.out.println(json);
    }
}