package com.entry;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "any_item", schema = "anymall", catalog = "")
public class AnyItem {

    private int id;
    private String name;
    private Double price;
    private Double oprice;
    private String producer;
    private String productPlace;
    private Integer num;
    private String img;
    private String sn;
    private Date ctime;
    private Date utime;
    private Integer cuid;
    private Integer uuid;
    private String desc;
    private String keywords;

    public AnyItem() {
    }

    public AnyItem(String name, Double price, Double oprice, String producer, String productPlace, Integer num, String img, String sn, Date ctime, Date utime, Integer cuid, Integer uuid, String desc, String keywords) {
        this.name = name;
        this.price = price;
        this.oprice = oprice;
        this.producer = producer;
        this.productPlace = productPlace;
        this.num = num;
        this.img = img;
        this.sn = sn;
        this.ctime = ctime;
        this.utime = utime;
        this.cuid = cuid;
        this.uuid = uuid;
        this.desc = desc;
        this.keywords = keywords;
    }

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 255)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "price", nullable = true, precision = 2)
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "oprice", nullable = true, precision = 2)
    public Double getOprice() {
        return oprice;
    }

    public void setOprice(Double oprice) {
        this.oprice = oprice;
    }

    @Basic
    @Column(name = "producer", nullable = true, length = 255)
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Basic
    @Column(name = "product_place", nullable = true, length = 255)
    public String getProductPlace() {
        return productPlace;
    }

    public void setProductPlace(String productPlace) {
        this.productPlace = productPlace;
    }

    @Basic
    @Column(name = "num", nullable = true)
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "img", nullable = true, length = 255)
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Basic
    @Column(name = "sn", nullable = true, length = 255)
    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    @Basic
    @Column(name = "ctime", nullable = false)
    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }

    @Basic
    @Column(name = "utime", nullable = true)
    public Date getUtime() {
        return utime;
    }

    public void setUtime(Date utime) {
        this.utime = utime;
    }

    @Basic
    @Column(name = "cuid", nullable = true)
    public Integer getCuid() {
        return cuid;
    }

    public void setCuid(Integer cuid) {
        this.cuid = cuid;
    }

    @Basic
    @Column(name = "uuid", nullable = true)
    public Integer getUuid() {
        return uuid;
    }

    public void setUuid(Integer uuid) {
        this.uuid = uuid;
    }

    @Basic
    @Column(name = "desc", nullable = true, length = 255)
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Basic
    @Column(name = "keywords", nullable = true, length = 255)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnyItem anyItem = (AnyItem) o;

        if (id != anyItem.id) return false;
        if (name != null ? !name.equals(anyItem.name) : anyItem.name != null) return false;
        if (price != null ? !price.equals(anyItem.price) : anyItem.price != null) return false;
        if (oprice != null ? !oprice.equals(anyItem.oprice) : anyItem.oprice != null) return false;
        if (producer != null ? !producer.equals(anyItem.producer) : anyItem.producer != null) return false;
        if (productPlace != null ? !productPlace.equals(anyItem.productPlace) : anyItem.productPlace != null)
            return false;
        if (num != null ? !num.equals(anyItem.num) : anyItem.num != null) return false;
        if (img != null ? !img.equals(anyItem.img) : anyItem.img != null) return false;
        if (sn != null ? !sn.equals(anyItem.sn) : anyItem.sn != null) return false;
        if (ctime != null ? !ctime.equals(anyItem.ctime) : anyItem.ctime != null) return false;
        if (utime != null ? !utime.equals(anyItem.utime) : anyItem.utime != null) return false;
        if (cuid != null ? !cuid.equals(anyItem.cuid) : anyItem.cuid != null) return false;
        if (uuid != null ? !uuid.equals(anyItem.uuid) : anyItem.uuid != null) return false;
        if (desc != null ? !desc.equals(anyItem.desc) : anyItem.desc != null) return false;
        if (keywords != null ? !keywords.equals(anyItem.keywords) : anyItem.keywords != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (oprice != null ? oprice.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        result = 31 * result + (productPlace != null ? productPlace.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        result = 31 * result + (sn != null ? sn.hashCode() : 0);
        result = 31 * result + (ctime != null ? ctime.hashCode() : 0);
        result = 31 * result + (utime != null ? utime.hashCode() : 0);
        result = 31 * result + (cuid != null ? cuid.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        result = 31 * result + (desc != null ? desc.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        return result;
    }
}
