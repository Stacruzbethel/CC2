
package cc2uc;
import java.util.Scanner;
public class CC2UC {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int dep ;
        String prog;
        
        
        System.out.println("Choose a department: ");
        System.out.println("===================================");
        System.out.println("[1]College of Accountancy\n"+"[2]College of College of Engineering and Architecture\n"+"[3]College of Information Technology and Computer Science\n"+
                                                "[4]College of Teacher Education\n"+"[5]College of Arts and Sciences\n"+"[6]College of Business Administration");
        dep = scan.nextInt();
            if(dep==1){
                System.out.println("===================================");
                System.out.println("(Choose) College of Accountancy programs:\n"+
                            "Bachelor of Science in Accountancy\n"+"Bachelor of Schience in Accounting Technology\n"+
                        "Bachelor of Science in Management Accounting\n"+"Bachelor of Science in Forensic Accouting");
                        prog = scan.next();
                             if(prog.equalsIgnoreCase("BSA")){
                                 System.out.println("==================================="+"\nDepartment: College of Accountancy(COA)\n"+
                                         "Program: Bachelor of Science in Accountancy");
                                 System.out.println("The Bachelor of Science in Accountancy (BSA) curriculum adopts CHEM MEMORANDUM ORDER NO. 3\n"
                                         + "Series of 2007, which is based on International Education Standards aimed to equip students to meet the \n"
                                         + "competencies required in the workplace whether in the country or abroad. It is an 11 trimester course(3 years \n"
                                         + "plus 2 semesters) which is equivalent to a 5-year course in a semestral setting. The program prepares students\n"
                                         + "to be liberally educated accountants who can think and write clearly, effective, and critically. It also prepares\n"
                                         + "them to become total business adivors, who are knowledgeable with business structures and economic conepts\n"
                                         + "and trans them to be ethically and technically competent in the field of accounting and auditing.");
                             }
                             else if(prog.equalsIgnoreCase("BSAT")){
                                 System.out.println("==================================="+"\nDepartment: College of Accountancy(COA)\n"+
                                         "Program: Bachelor of Science in Accounting Technology");
                                System.out.println("The BSAct is a program that prepares students for a career in the accounting and finance\n"
                                        + "divisions of organizations in the private and public sectors. The accounting courses on the BSAcT program\n"
                                        + "cobined with business management courses, equip students with the needed skills, proficiency and intellectual\n"
                                        + "abilities to lead successful careers. All four major sectors of accountancy, namely public practice, commerce and\n"
                                        + "industry, government, and education, need support staff who will work as bookkeepers. financial analysts, audit staff\n"
                                        + "inventory control accountants, general ledger accountants, receivables accountants, payables accountants, and other\n"
                                        + "and other functions where the CPA credential is not required. The BSAcT graduate could adequately respond to this need.");
                             }
                             else if(prog.equalsIgnoreCase("BSMA")){
                                 System.out.println("==================================="+"\nDepartment: College of Accountancy(COA)\n"+
                                         "Program: Bachelor of Science in Management Accounting");
                                 System.out.println("The BMSA is a 9 trimester course(3 years), equivalent to a 4-year course in a semestral setting. The course\n"
                                         + "prepares students for a career within the accountring and finance division of both private enterprises and public sectors.\n"
                                         + "The courses offered are a combination of accountring and related business subjects to equip them with the needed skills, \n"
                                         + "profeciency and intellectual abilities. All the four(4) major fields of Accountancy, namely, public practice, commerce and \n"
                                         + "and industry, government, and education, need support staff to work as bookkeepers, financial analysts, audit staff,\n"
                                         + "inventory control personnel, accounts payable administration personnel and other accountring works where a CPA title is not\n"
                                         + "required. The BMSA graduate could adequately respond to this need.");
                             }
                             else if(prog.equalsIgnoreCase("BSFA")){
                                 System.out.println("==================================="+"\nDepartment: College of Accountancy(COA)\n"+
                                         "Program: Bachelor of Science in Forensic Accounting");
                                 
                             }
                             else{
                                 System.out.println("Error. Try again.");
                             }
            }
            else if(dep==2){
                System.out.println("===================================");
                System.out.println("(Choose) College of Engineering and Architecture:\n"+
                        "Bachelor of Science in Architecture\n"+"Bachelor of Science in Civil Engineering\n"+
                        "Bachelor of Science in Computer Engineering\n"+"Bachelor of Science in Electronics Engineering\n"+
                        "Bachelor of Scince in Environmental and Sanitary Engineering");
                        prog = scan.next();
                            if(prog.equalsIgnoreCase("BSA")){
                                System.out.println("==================================="+"\nDepartment: College of Engineering and Achitecture(CEA)\n"+
                                         "Program: Bachelor of Science in Architecture");
                            }
                            else if(prog.equalsIgnoreCase("BSCE")){
                                System.out.println("==================================="+"\nDepartment: College of Engineering and Achitecture(CEA)\n"+
                                         "Program: Bachelor of Science in Civil Engineering");
                            }
                            else if(prog.equalsIgnoreCase("BSCE")){
                                System.out.println("==================================="+"\nDepartment: College of Engineering and Achitecture(CEA)\n"+
                                         "Program: Bachelor of Science in Computer Engineering");
                            }
                            else if(prog.equalsIgnoreCase("BSEE")){
                                System.out.println("==================================="+"\nDepartment: College of Engineering and Achitecture(CEA)\n"+
                                         "Program: Bachelor of Science in Electronics Engineering");
                            }
                            else if(prog.equalsIgnoreCase("BSESE")){
                                System.out.println("==================================="+"\nDepartment: College of Engineering and Achitecture(CEA)\n"+
                                         "Program: Bachelor of Science in Environmental and Sanitary Engineering");
                            }
                            else {
                                System.out.println("Error. Try again.");
                            }
            }
            else if(dep==3){
                System.out.println("===================================");
                System.out.println("(Choose) College of Information Technology and Computer Science programs:\n"+
                        "Bachelor of Science in Computer Science\n"+"Bachelor of Science in Information System\n"+
                        "Bachelor of Science in Information Technology\n"+"Bachelor of Science in Computer Technology\n");
                        prog = scan.next();
                            if(prog.equalsIgnoreCase("BSCS")){
                                System.out.println("==================================="+"\nDepartment: College of Information Technology and Computer Science(CITCS)\n"+
                                         "Program: Bachelor of Science in Computer Science");
                            }
                            else if(prog.equalsIgnoreCase("BSIS")){
                                System.out.println("==================================="+"\nDepartment: College of Information Technology and Computer Science(CITCS)\n"+
                                         "Program: Bachelor of Science in Information System");
                            }
                            else if(prog.equalsIgnoreCase("BSIT")){
                                System.out.println("==================================="+"\nDepartment: College of Information Technology and Computer Science(CITCS)\n"+
                                         "Program: Bachelor of Science in Information Technology");
                            }
                            else if(prog.equalsIgnoreCase("BSCT")){
                                System.out.println("==================================="+"\nDepartment: College of Information Technology and Computer Science(CITCS)\n"+
                                         "Program: Bachelor of Science in Computer Technology");
                            }
                            else {
                                System.out.println("Error. Try again.");
                            }
            }
            else if(dep==4){
                System.out.println("===================================");
                System.out.println("(Choose) College of Teacher Education(CTE) programs:\n"+
                        "Bachelor of Science in Elementary Education-General\n"+"Bachelor of Science in Elementary Education\n"+
                        "Bachelor of Science in Secondary Education");
                        prog = scan.next();
                            if(prog.equalsIgnoreCase("BSEE General")){
                                System.out.println("==================================="+"\nDepartment: College of Teacher Education\n"+
                                         "Program: Bachelor of Science in Education-General");
                            }
                            else if(prog.equalsIgnoreCase("BSEE")){
                                System.out.println("==================================="+"\nDepartment: College of Teacher Education\n"+
                                         "Program: Bachelor of Science in Elementary Education");
                            }
                            else if(prog.equalsIgnoreCase("BSSE")){
                                System.out.println("==================================="+"\nDepartment: College of Teacher Education\n"+
                                         "Program: Bachelor of Science in Secondary Education");
                            }
                            else {
                                System.out.println("Error. Try again.");
                            }
    }
    else if(dep==5){
         System.out.println("===================================");
                System.out.println("(Choose) College of Arts and Sciences:\n"+
                            "Bachelor of Arts and English\n"+"Bachelor of Arts in Political Science\n"+
                        "Bachelor of Arts in Communication\n"+"Bachelor of Science in Psychology");
                        prog = scan.next();
    
            if(prog.equalsIgnoreCase("BAE")){
                                System.out.println("==================================="+"\nDepartment: College of Arts and Sciences\n"+
                                         "Program: Bachelor of Arts and English");
                               
                            }
            else if(prog.equalsIgnoreCase("BAPS")){
                System.out.println("==================================="+"\nDepartment: College of Arts and Sciences\n"+
                                         "Program: Bachelor of Arts in Political Science");
                System.out.println("\n");
            }
            else if(prog.equalsIgnoreCase("BAC")){
                System.out.println("==================================="+"\nDepartment: College of Arts and Sciences\n"+
                                         "Program: Bachelor of Arts in Communication");
            }
            else if(prog.equalsIgnoreCase("BSP")){
                System.out.println("==================================="+"\nDepartment: College of Arts and Sciences\n"+
                                         "Program: Bachelor of Science in Psychology");
            }
            else {
                                System.out.println("Error. Try again.");
                            }
    }
    else if(dep==6){
         System.out.println("===================================");
                System.out.println("(Choose) College of Business Administration programs:\n"+
                            "Bachelor of Science in Business Administration\n"+"Bachelor of Science in Entrepreneurship\n"+
                        "Bachelor of Science in Office Administration\n");
                prog = scan.next();
                if(prog.equalsIgnoreCase("BSBA")){
                    System.out.println("==================================="+"\nDepartment: College of Business Administration\n"+
                                         "Program: Bachelor of Science in Business Administration");
                }
                else if(prog.equalsIgnoreCase("BSE")){
                    System.out.println("==================================="+"\nDepartment: College of Business Administration\n"+
                                         "Program: Bachelor of Science in Entrepreneurship");
                }
                else if(prog.equalsIgnoreCase("BSOA")){
                    System.out.println("==================================="+"\nDepartment: College of Business Administration\n"+
                                         "Program: Bachelor of Science in Office Administration");
                     
                }
    }
    }
    
}
