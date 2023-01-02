package ma.devoir.entiter;

import ma.devoir.entiter.IMetier;
import ma.devoir.entiter.Produit;

import java.util.ArrayList;
import java.util.List;

public class MetierProduit implements IMetier<Produit> {
    private List<Produit> ListProduit = new ArrayList<>();

    @Override
    public void add(Produit o) {
        Produit p1 = findById(o.getId());
        if(p1 == null) {
            this.ListProduit.add(o);
        }else {
            System.out.println("this id is already exists!");
        }
    }

    @Override
    public List<Produit> getAll() {
        return this.ListProduit;
    }

    @Override
    public Produit findById(long id) {

        for (Produit p: this.ListProduit) {
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }

    @Override
    public void delete(long id) {

        if(getListProduit().size() == 0){
            System.out.println("your list is empty!!!");
        }else {
            for (Produit p : ListProduit) {
                if (p.getId() == id) {
                    this.ListProduit.remove(p);
                    System.out.println("you produt is deleted!!");
                }

            }
        }
    }

    public List<Produit> getListProduit() {
        return ListProduit;
    }

    public void setListProduit(List<Produit> listProduit) {
        ListProduit = listProduit;
    }
}
