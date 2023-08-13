package com.esranursevilmis.friendscharacters
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.esranursevilmis.friendscharacters.databinding.ActivityTanitimBinding
import com.esranursevilmis.friendscharacters.databinding.RecycleRowBinding

class FriendsAdapter(val chList:ArrayList<Friends>) :RecyclerView.Adapter<FriendsAdapter.FriendsHolder> (){
    class FriendsHolder(val binding: RecycleRowBinding):RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendsHolder {
      val binding=RecycleRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return FriendsHolder(binding)
    }

    override fun getItemCount(): Int {
        return chList.size
    }

    override fun onBindViewHolder(holder: FriendsHolder, position: Int) {
      holder.binding.recyclerRowTextView.text= chList.get(position).name

        holder.itemView.setOnClickListener{
            val intent=Intent(holder.itemView.context,TanitimActivity::class.java)
            intent.putExtra("friends",chList.get(position))
            holder.itemView.context.startActivity(intent)
        }
    }
}