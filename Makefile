.PHONY: clj cljs

clj:
		clj -M -m hello-world.core

cljs:
		clj -M -m cljs.main --compile hello-world.core