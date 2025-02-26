package Tuan6.ContactManagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class WorkerList {
    public List<Worker> workers = new ArrayList<>();

    public boolean addWorker(Worker w)
    {
        for(Worker worker : workers)
        {
            if(worker.getId().equalsIgnoreCase(w.getId()))
            {
                return false;
            }
        }
        if(w.getAge()<18 || w.getAge()>50)
        {
            return false;
        }
        if(w.getSalary()<=0)
        {
            return false;
        }
        workers.add(w);
        return true;
    }
    public boolean increaseSalary(String id, double amount)
    {
        if(amount<=0)
        {
            return false;
        }
        for(Worker worker : workers)
        {
            if(worker.getId().equalsIgnoreCase(id))
            {
                worker.setSalary(worker.getSalary()+amount);
                return true;
            }
        }
        return false;
    }

    public boolean decreaseSalary(String id, double amount)
    {
        if(amount<=0)
        {
            return false;
        }
        for(Worker worker : workers)
        {
            if(worker.getId().equalsIgnoreCase(id))
            {
                worker.setSalary(worker.getSalary()-amount);
                return true;
            }
        }
        return false;
    }

    public List<Worker> getWorkers() {
        Collections.sort(workers);
        return workers;
    }


}
