import familyTree.FamilyTree;
import presenter.Presenter;
import service.Service;
import ui.Console;
import ui.View;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        FamilyTree test = new FamilyTree();

        Service service = new Service(test);


        View view = new Console();
        Presenter presenter = new Presenter(view, service);
        view.start();
    }
}