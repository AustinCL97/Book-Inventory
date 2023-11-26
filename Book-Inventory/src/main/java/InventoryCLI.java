import Menu.Menu;

public class InventoryCLI {

    private static final String MAIN_MENU_OPTION_DISPLAY_BOOKS = "Display All Books";
    private static final String MAIN_MENU_OPTION_DISPLAY_BOOKS_GENRE = "Display Books by Genre";
    private static final String MAIN_MENU_OPTION_DISPLAY_BOOKS_AUTHOR = "Display Books by Author";
    private static final String MAIN_MENU_OPTION_DISPLAY_BOOKS_READ = "Display Read Books";
    private static final String MAIN_MENU_OPTION_DISPLAY_UNREAD_BOOKS = "Display Unread Books";
    private static final String MAIN_MENU_OPTION_ADD_BOOK = "Add a Book";
    private static final String MAIN_MENU_OPTION_MARK_READ = "Mark a Book as Read";
    private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_BOOKS, MAIN_MENU_OPTION_DISPLAY_BOOKS_GENRE,
            MAIN_MENU_OPTION_DISPLAY_BOOKS_AUTHOR, MAIN_MENU_OPTION_DISPLAY_BOOKS_READ, MAIN_MENU_OPTION_DISPLAY_UNREAD_BOOKS, MAIN_MENU_OPTION_ADD_BOOK, MAIN_MENU_OPTION_MARK_READ,};

    private Menu menu;

    public InventoryCLI(Menu menu){
        this.menu = menu;
    }





}
