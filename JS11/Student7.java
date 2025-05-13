public class Student7 {

    String nim, name, studyProgram, className;
    
    public Student7(String nim, String name, String studyProgram, String className){
        this.nim=nim;
        this.name=name;
        this.studyProgram=studyProgram;
        this.className=className;
    }

    void print(){
        System.out.println(nim+" - "+name+" - "+studyProgram+" - "+className);
    }
}
