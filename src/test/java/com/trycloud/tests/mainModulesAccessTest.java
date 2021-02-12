package com.trycloud.tests;

import com.trycloud.pages.AllFilesPage;
import com.trycloud.pages.LoginPage;
import com.trycloud.tests.base.TestBase;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class mainModulesAccessTest extends TestBase {



    @Test
    public void verifyMainModulesAccessFiles(){

        AllFilesPage allModules = new AllFilesPage();

        String expectedTitleFiles = allModules.expectedTitleFiles;
        String filesGetActualTitle = allModules.filesGetActualTitle();
        Assert.assertEquals(filesGetActualTitle,expectedTitleFiles, "We have access to Files");

    }
    @Test
    public void verifyMainModulesAccessActivities(){

        AllFilesPage allModules = new AllFilesPage();

        String expectedTitleActivities = allModules.expectedTitleActivities;
        String activityGetActualTitle = allModules.activityGetActualTitle();
        Assert.assertEquals(activityGetActualTitle,expectedTitleActivities, "We have access to Activities");

    }
    @Test
    public void verifyMainModulesAccessGallery(){

        AllFilesPage allModules = new AllFilesPage();

        String expectedTitleGallery = allModules.expectedTitleGallery;
        String galleryGetActualTitle = allModules.galleryGetActualTitle();
        Assert.assertEquals(galleryGetActualTitle,expectedTitleGallery, "We have access to Gallery");

    }
    @Test
    public void verifyMainModulesAccessTalk(){

        AllFilesPage allModules = new AllFilesPage();

        String expectedTitleTalk = allModules.expectedTitleTalk;
        String talkGetActualTitle = allModules.talkGetActualTitle();
        Assert.assertEquals(talkGetActualTitle,expectedTitleTalk, "We have access to Talk");

    }
    @Test
    public void verifyMainModulesAccessCalendar(){

        AllFilesPage allModules = new AllFilesPage();

        String expectedTitleCalendar = allModules.expectedTitleCalendar;
        String calendarGetActualTitle = allModules.calendarGetActualTitle();
        Assert.assertEquals(calendarGetActualTitle,expectedTitleCalendar, "We have access to Calendar");

    }


}
