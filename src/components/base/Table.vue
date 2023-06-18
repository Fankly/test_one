<template>
  <el-table v-bind="$attrs">
    <template :key="index" v-for="(index, name) in $slots" #[name]="slotData">
      <slot :name="name" v-bind="slotData || {}"></slot>
      <TableColumn
        :col="item"
        :key="item.prop ?? item.label ?? index"
        v-for="(item, index) in columns"
      >
        <template v-for="slot in Object.keys(customSlots)" #[slot]="scope">
          <slot :name="slot" v-bind="scope"></slot>
        </template>
      </TableColumn>
    </template>
  </el-table>
</template>

<script setup lang="ts">
import TableColumn from "@/components/base/TableColumn.vue";
import type { TableData } from "@/types/tableData";
import { getCurrentInstance, onMounted } from "vue";

const props = defineProps<TableData[]>();

const instance = getCurrentInstance();

onMounted(() => {
  console.log(instance);
}),
  defineExpose({
    props,
    instance
  });
</script>

<style scoped></style>
