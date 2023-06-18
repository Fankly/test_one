<template>
  <el-table ref="tableRef" v-bind="$attrs">
    <template #empty="scope">
      <slot name="empty" v-bind="scope"></slot>
    </template>
    <template #append="scope">
      <slot name="append" v-bind="scope"></slot>
    </template>
    <TableColumn
      :col="item"
      :key="item.prop ?? item.label ?? index"
      v-for="(item, index) in columns"
    >
      <template v-for="slot in Object.keys(customSlots)" #[slot]="scope">
        <slot :name="slot" v-bind="scope"></slot>
      </template>
    </TableColumn>
  </el-table>
</template>
<script setup lang="ts">
import TableColumn from "@/components/base/TableColumn.vue";
import { getCurrentInstance, reactive } from "vue";
import type { TableProps } from "@/types/tableData";
defineProps({
  columns: {
    type: Array<TableProps>,
    required: true
  }
});

const { proxy }: any = getCurrentInstance();

const customSlots = reactive({
  ...proxy.$slots
});
</script>

<style scoped></style>
