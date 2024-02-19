package ule.edi.geometry;

public class AttrVec2fImpl extends AbstractVec2Impl {

	private float u,v;
	
	
	public AttrVec2fImpl() {
		this.u=0.0f;
		this.v=0.0f;
	}
	
	public AttrVec2fImpl(float u, float v) {
		this.u=u;
		this.v=v;
	}

	public AttrVec2fImpl(Vec2f other) {
		this.u = other.getCx(1);
		this.v = other.getCx(2);
	}
	
	@Override
	public float getCx(int n)throws IllegalArgumentException{
		
		if(n==1){
			return this.u;
		}else if(n==2){
			return this.v;
		}else{
			throw new java.lang.IllegalArgumentException();
		}
	
	}

	@Override
	public void setCx(int n, float v) throws IllegalArgumentException {
	
		if(n==1){
			this.u = v;
		}else if(n==2){
			this.v = v;
		}else{
			throw new java.lang.IllegalArgumentException();
		}
	}
}
