package weeklyQuiz2;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook () {
        this.contacts = new ArrayList<Contact>();
    }

    public void add(Contact contact){       // 비즈니스건 퍼스널이건 상관없음.
        contacts.add(contact);
    }
    public void displayContacts() {
        if(contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        }
        // 연락처 정보 모두 출력
        for (Contact contact : contacts) {
            // 이름 : , 전화번호 : ,
            System.out.println(contact);        // == System.out.println(contact.toString()); 대신 toString()을 재정의 해주지 않으면 주소값이 나옴
        }
    }

    public void searchContact(String name){
        boolean isExist = false;
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                System.out.println(contact);
                isExist = true;
            }
        }
        if (!isExist) {
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}
