package app.queuemanagementsystem.BusinessLogic;

import app.queuemanagementsystem.Model.*;

import java.util.List;

public abstract class Strategy {


    public abstract void addTask(List<Server> servers, Task task);
}
