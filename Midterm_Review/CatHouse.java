package Midterm_Review;

public class CatHouse {
    private Cat cat1;
    private Cat cat2;
    private int totalVaccinesAdministered;

    public CatHouse(Cat cat1, Cat cat2) {
        this.cat1 = cat1;
        this.cat2 = cat2;
        totalVaccinesAdministered = 0;
    }

    public Cat getCat1() {
        return cat1;
    }

    public Cat getCat2() {
        return cat2;
    }

    public int getTotalVaccinesAdministered() {
        return totalVaccinesAdministered;
    }

    public boolean hasVaccinesInStock() {
        return !cat1.getName().equals("G");
    }

    public void rollCall() {
        if (cat1.getAge() > cat2.getAge()) {
          cat1.introduce();
          cat2.introduce();
        } else if (cat2.getAge() > cat1.getAge()) {
          cat2.introduce();
          cat1.introduce();
        } else {
          cat1.introduce();
          cat2.introduce();
        }
      }      

      public boolean performVaccinations() {
        if (!hasVaccinesInStock()) {
          return false;
        }
        if (cat1.isVaccinated() && cat2.isVaccinated()) {
          return false;
        }
        if (!cat1.isVaccinated()) {
          cat1.vaccinate();
          totalVaccinesAdministered++;
        }
        if (!cat2.isVaccinated()) {
          cat2.vaccinate();
          totalVaccinesAdministered++;
        }
        return true;
      }      
}
