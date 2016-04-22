package org.jug.algeria.domain;

import javax.persistence.*;
import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name = "`SEGMENT`")
public class Segment {

		@Id
	    @Column(name = "id", nullable = false)
	    private String id;


	/*	private Set<Asset> assets = new HashSet<Asset>();
		
		
		
		  public Segment(String id, Set<Asset> assets){
		        this.id = id;
		        this.assets = assets;
		    }

		  @ManyToMany(cascade = CascadeType.ALL)
		  @JoinTable(name = "segment_asset",
		    joinColumns = @JoinColumn(name = "segment_id", referencedColumnName = "id"),
		    inverseJoinColumns = @JoinColumn(name = "asset_id", referencedColumnName = "id"))
	    public Set<Asset> getAssets() {
			return assets;
		}

		public void setAssets(Set<Asset> assets) {
			this.assets = assets;
		}*/

		public Segment() {
	    }

	    public Segment(String id) {
	        this.id = id;
	    }


	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }


	    @Override
	    public String toString() {
	        return "Segment{" +
	                "id=" + id  + '\'' +
	                '}';
	    }
}
