package ru.itis.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.itis.ApplicationManager;
import ru.itis.model.AccountData;
import ru.itis.model.NotepadData;

public class EditNotepadTest extends TestBase {

    @Test
    public void addNewNote() {
        AccountData user = new AccountData("annie.tugb@gmail.com","Annchs20" );
        applicationManager.getNavigation().openHomePage();
        applicationManager.getAuth().login(user.getUsername(), user.getPassword());
        NotepadData notepadData = new NotepadData("string1");
        applicationManager.getNavigation().openProfile();
        applicationManager.getNotepad().addStringToNotepad(notepadData.getString());
        applicationManager.getNotepad().saveNotepad();
        NotepadData createdNotepad = applicationManager.getNotepad().getCreatedNotepadNote();
        Assert.assertEquals(notepadData.getString(), createdNotepad.getString());
    }

}
