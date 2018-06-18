package p3.MasterMind;

abstract class MmAppHead extends MmTerms {

	protected MmAppHead() {
		MmMenuElements mmHead = new MmMenuElements();

		mmHead.setElement1(MmTerms.term1);
		mmHead.setElement2(MmTerms.term2);
		mmHead.setElement3(MmTerms.term3);
		mmHead.getHeadTable().add(MmTerms.term1);
		mmHead.getHeadTable().add(MmTerms.term2);
		mmHead.getHeadTable().add(MmTerms.term3);
		for (int i=0; i<mmHead.getHeadTable().size();i++) {
			System.out.println(mmHead.getHeadTable().get(i));
		}
		System.out.print("\n");
	}

}
