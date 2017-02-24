public static void Hanoi(stack a, stack b, stack c){
	while(!a.isEmpty()){
		Node ToMove = a.pop();
		if(c.isEmpty() || c.top() >= ToMove.data){
			c.push(ToMove);
		}else if(b.isEmpty() || b.top() >= ToMove.data){
			b.push(ToMove);
		}else{
			if(c.bottom()<b.top()){
				ToMove = c.bottom();
				b.push(ToMove);
			}
			if(b.bottom()<c.top()){
				ToMove = b.bottom();
				c.push(ToMove);
			}
		}
		}
		if(c.isEmpty()){
			ToMove = b.bottom();
			c.push(ToMove);
		}
	}