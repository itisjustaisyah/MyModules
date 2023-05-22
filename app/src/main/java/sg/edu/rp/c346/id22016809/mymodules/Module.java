package sg.edu.rp.c346.id22016809.mymodules;

import android.annotation.SuppressLint;

/**
 * Created by Nuur Aisyah Binte Farouk on 22/5/2023.
 * C346-1D-E63A-A
 */
public class Module {
    String code;
    String name;
    String year;
    int semester;
    int credit;
    String venue;

    public Module(String code, String name, String year, int semester, int credit, String venue) {
        this.code = code;
        this.name = name;
        this.year = year;
        this.semester = semester;
        this.credit = credit;
        this.venue = venue;
    }

    @SuppressLint("DefaultLocale")
    public String moduleInfo() {
        String moduleTemplate =
                "Module Code: %s\n" +
                "Module name: %s\n" +
                "Academic Year: %s\n" +
                "Semester: %d\n" +
                "Module Credit: %d\n" +
                "Venue: %s";
        return String.format(moduleTemplate, code, name, year, semester, credit, venue);
    }
}
